package dev.bella.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collation = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String reviewBody;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Review(String reviewBody, LocalDateTime created, LocalDateTime updated) {
        this.reviewBody = reviewBody;
        this.created = created;
        this.updated = updated;
    }
}
