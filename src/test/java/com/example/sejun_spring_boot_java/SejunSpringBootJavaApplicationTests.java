package com.example.sejun_spring_boot_java;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.sejun_spring_boot_java.entities.Question;
import com.example.sejun_spring_boot_java.repositories.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SejunSpringBootJavaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private QuestionRepository questionRepository;

/*
    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("sbb가 무엇인가요?");
        q1.setContent("sbb에 대해서 알고 싶습니다.");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("스프링부트 모델 질문입니다.");
        q2.setContent("id는 자동으로 생성되나요?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);
    }
*/

    @Test
    void testJpa() {
        List<Question> questionList = this.questionRepository.findAll();
        assertEquals(2, questionList.size());

        Question q = questionList.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
    }

}
