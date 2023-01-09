//package hellocucumber;
//
//import java_code.MoodleActuator;
//import org.junit.platform.suite.api.ConfigurationParameter;
//import org.junit.platform.suite.api.IncludeEngines;
//import org.junit.platform.suite.api.SelectClasspathResource;
//import org.junit.platform.suite.api.Suite;
//
//import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
//
//@Suite
//@IncludeEngines("cucumber")
////@SelectClasspathResource("hellocucumber")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//
//
//
//public class RunCucumberTest {
//    private static String STUDENT_USERNAME = "tal";
//    private static String STUDENT_PASSWORD = "Tala12397!";
//    private static String TEACHER_USERNAME = "Admin";
//    private static String TEACHER_PASSWORD = "Roihass1*";
//    private static String COURSE_NAME = "qa";
//    private int DEFAULT_LENGTH = 5;
//    private static String query = "abcd";
//    private static MoodleActuator moodle = new MoodleActuator();
//    private static String webDriver = "webdriver.chrome.driver";
//    private static String path = "\\C:\\Users\\roiha\\Documents\\SISE\\3rd year\\QA\\sqe-hw3-main\\sqe-hw3-main\\Selenium\\chromedriver.exe\\";
//
//    public static void main(String[] args) throws InterruptedException {
////        RunCucumberTest runCucumberTest = new RunCucumberTest();
////        Thread t1 = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                System.out.println("--------------- STARTING MOODLE MULTIPLE CHOICE QUIZ TEST ---------------");
////                System.out.println("--------------- MULTIPLE CHOICE QUIZ TEST - TEACHER LOGIN ---------------");
//////                moodle = new MoodleActuator();
////                moodle.initSession(webDriver, path);
////                moodle.goToLogin();
////                moodle.enterLoginInfo(TEACHER_USERNAME,TEACHER_PASSWORD);
////                moodle.goToCoursePage(COURSE_NAME);
////                moodle.goToForum();
////                moodle.goToSearchBar(query);
////                moodle.clickDelete();
////                moodle.confirmDelete();
////            }
////        });
////        Thread t2 = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                System.out.println("--------------- STARTING MOODLE MULTIPLE CHOICE QUIZ TEST ---------------");
////                System.out.println("--------------- MULTIPLE CHOICE QUIZ TEST - TEACHER LOGIN ---------------");
//////                moodle = new MoodleActuator();
////                moodle.initSession(webDriver, path);
////                moodle.goToLogin();
////                moodle.enterLoginInfo(STUDENT_USERNAME,STUDENT_PASSWORD);
////                moodle.goToCoursePage(COURSE_NAME);
////                moodle.goToForum();
////                moodle.goToSearchBar(query);
////            }
////        });
////        t1.start();
////        t2.start();
////        t1.join();
//////        Thread.sleep(1000);
////
//////        t2.join();
//////        RunCucumberTest runCucumberTest = new RunCucumberTest();
//////        runCucumberTest.searchComment();
//////        RunCucumberTest runCucumberTest1 = new RunCucumberTest();
//////        runCucumberTest1.deleteComment();
//    }
//
//
//    public RunCucumberTest() {
//        System.out.println("--------------- INITIALIZING MOODLE TEST - OPENING WEBPAGE ---------------");
//        moodle = new MoodleActuator();
//        moodle.initSession(webDriver, path);
//    }
//
//    private void searchComment() {
//        System.out.println("--------------- STARTING MOODLE MULTIPLE CHOICE QUIZ TEST ---------------");
//        System.out.println("--------------- MULTIPLE CHOICE QUIZ TEST - TEACHER LOGIN ---------------");
//        moodle.goToLogin();
//        moodle.enterLoginInfo(STUDENT_USERNAME,STUDENT_PASSWORD);
//        moodle.goToCoursePage(COURSE_NAME);
//        moodle.goToForum();
//        moodle.goToSearchBar(query);
//    }
//    private void deleteComment() {
//        System.out.println("--------------- STARTING MOODLE MULTIPLE CHOICE QUIZ TEST ---------------");
//        System.out.println("--------------- MULTIPLE CHOICE QUIZ TEST - TEACHER LOGIN ---------------");
//        moodle.goToLogin();
//        moodle.enterLoginInfo(TEACHER_USERNAME,TEACHER_PASSWORD);
//        moodle.goToCoursePage(COURSE_NAME);
//        moodle.goToForum();
//        moodle.goToSearchBar(query);
//        moodle.clickDelete();
//        moodle.confirmDelete();
//
//    }
//
//
//
//
//}
