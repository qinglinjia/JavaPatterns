package cn.com;

import cn.com.person.Student;
import cn.com.person.Teacher;

/**
 * 测试模板模式
 *
 * @author jiaql
 * @create 2017-05-05 17:24
 */
public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("********开始学生的早上流程********");
        student.prepareGotoSchool();

        System.out.println();
        System.out.println("********开始老师的早上流程********");
        Teacher teacher  = new Teacher();
        teacher.prepareGotoSchool();
    }
}
