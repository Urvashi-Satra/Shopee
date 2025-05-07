package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class CategoryResponse {

    private List<CategoryDTO> content;

    public CategoryResponse(List<CategoryDTO> content) {
        this.content = content;
    }

    public CategoryResponse(){
    }

    public List<CategoryDTO> getContent() {
        return content;
    }

    public void setContent(List<CategoryDTO> content) {
        this.content = content;
    }
}
