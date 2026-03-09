package pers.kieran.study.entities;

import dev.langchain4j.model.input.structured.StructuredPrompt;
import lombok.Data;

/**
 * @Description: TODO
 */
@Data
@StructuredPrompt("根据中国{{legal}}法律，解答以下问题：{{question}}")
public class LawPrompt
{
    private String legal;
    private String question;
}
