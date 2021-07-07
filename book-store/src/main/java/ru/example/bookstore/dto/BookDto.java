package ru.example.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.example.bookstore.handler.ValidationErrorTerms;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    @JsonProperty
    private Integer id;

    @JsonProperty
    @NotNull(message = ValidationErrorTerms.AUTHOR_MUST_BE_SET)
    private String author;

    @JsonProperty
    @NotNull(message = ValidationErrorTerms.TITLE_MUST_BE_SET)
    private String title;

    @JsonProperty
    @NotNull(message = ValidationErrorTerms.PRICE_MUST_BE_SET)
    private BigDecimal price;
}
