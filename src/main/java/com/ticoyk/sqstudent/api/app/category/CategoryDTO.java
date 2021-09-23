package com.ticoyk.sqstudent.api.app.category;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CategoryDTO {

    @Size(min=4, max=15, message = "Category name size, should be between 4 and 15")
    @NotBlank(message = "Name is required")
    private String name;

}
