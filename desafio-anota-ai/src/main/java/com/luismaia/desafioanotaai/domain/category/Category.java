package com.luismaia.desafioanotaai.domain.category;

import com.luismaia.desafioanotaai.domain.category.exceptions.TitleCategoryLength;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;

    public Category(CategoryDTO categoryDTO){
        if(categoryDTO.title().length() < 4){
            throw new TitleCategoryLength();
        }
        this.title = categoryDTO.title();
        this.description = categoryDTO.description();
        this.ownerId = categoryDTO.ownerId();
    }
}
