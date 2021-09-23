package com.ticoyk.sqstudent.api.app.question;

import com.ticoyk.sqstudent.api.app.dto.PageDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;


public interface QuestionService {

    Question saveQuestion(QuestionDTO question, Authentication authentication);
    Question updateQuestion(Long id, QuestionDTO question);
    PageDTO<Question> findAll(Pageable pageable);
    Question findQuestionById(Long id);

}
