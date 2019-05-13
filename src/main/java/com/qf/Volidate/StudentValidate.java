package com.qf.Volidate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.qf.pojo.Student;

/**
 * 学生的校验器类
 * @author james
 *
 */
public class StudentValidate implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Student stu = (Student) target;

        ValidationUtils.rejectIfEmpty(errors, "name", "stu.name");
        ValidationUtils.rejectIfEmpty(errors, "pass", "stu.pass");
        ValidationUtils.rejectIfEmpty(errors, "age", "stu.age");
        ValidationUtils.rejectIfEmpty(errors, "score", "stu.score");

        int age = stu.getAge();

        if(age < 16){
            errors.rejectValue("age", "stu.age.invalidate");
        }

        double score = stu.getScore();

        if(score < 0){
            errors.rejectValue("score", "stu.score.invalidate");
        }
    }

}
