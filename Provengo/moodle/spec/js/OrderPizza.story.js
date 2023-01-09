//@provengo summon selenium
//@provengo summon constraints
//Constraints.after(bp.Event("navigate_to_login")).require(bp.Event("enter_details"))
//Constraints.after(bp.Event("enter_details")).require(bp.Event("navigate_to_coursePage"))
//Constraints.after(bp.Event("navigate_to_coursePage")).require(bp.Event("navigate_to_forum"))
//Constraints.after(bp.Event("navigate_to_forum")).require(bp.Event("search_student"))
//Constraints.after(bp.Event("search_student")).require(bp.Event("delete_message"))
//
//  story('waiting for all to login', function () {
//      block(Any("navigate_to_coursePage"), function () {
//              waitFor(Any("enter_details"))
//      })
//  })
//    story('waiting for all to login', function () {
//        block(Any("navigate_to_forum"), function () {
//                waitFor(Any("navigate_to_coursePage"))
//        })
//    })
//    story('waiting for all to login', function () {
//            block(Any("search_student"), function () {
//                    waitFor(Any("navigate_to_forum"))
//            })
//        })
//
//

  story('waiting for student to search', function () {
      block(Any("search_student"), function () {
              waitFor(Any("search_teacher"))
      })

  })
    story('waiting for student to search', function () {
        block(Any("search_teacher"), function () {
                waitFor(Any("search_student"))
        })

    })
  story('waiting for student to search', function () {
      block(Any("delete_message"), function () {
              waitFor(Any("search_student"))
      })

  })

bthread("Successful search in forum",function(){
    request(bp.Event("student_navigate_to_login"));
    request(bp.Event("student_enter_details"));
    request(bp.Event("student_navigate_to_coursePage"));
    request(bp.Event("student_navigate_to_forum"));
    request(bp.Event("search_student"));

})
bthread("Successful delete a message in forum by the teacher",function(){
    request(bp.Event("teacher_navigate_to_login"));
    request(bp.Event("teacher_enter_details"));
    request(bp.Event("teacher_navigate_to_coursePage"));
    request(bp.Event("teacher_navigate_to_forum"));
    request(bp.Event("search_admin"));
    request(bp.Event("delete_message"));
})

bthread("delete after search",function(){
  sync({
  waitFor:bp.Event("search_student"),
  block:bp.Event("delete_message")
  });
})
story('Successful search in forum', function () {
  let s = new SeleniumSession().start('http://localhost')
  s.navigate_to_login()
  s.enter_details({ UserName: 'tal', Password:'Tala12397!'})
  s.navigate_to_coursePage({courseName:'qa'})
  s.navigate_to_forum()
  s.search_student({query:'abcd'})

})

story('Successful delete a message in forum by the teacher', function () {
  let s = new SeleniumSession().start('http://localhost')
  s.navigate_to_login()
  s.enter_details({ UserName: 'Admin', Password:'Roihass1*'})
  s.navigate_to_coursePage({courseName:'qa'})
  s.navigate_to_forum()
  s.search_admin({query:'abcd'})
  s.delete_message()
})



