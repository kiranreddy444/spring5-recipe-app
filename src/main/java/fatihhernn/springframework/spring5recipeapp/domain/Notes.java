package fatihhernn.springframework.spring5recipeapp.domain;

import lombok.*;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;


}
