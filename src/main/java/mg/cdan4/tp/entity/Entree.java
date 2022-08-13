package mg.cdan4.tp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ident;
    private String nent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String description;
    private double montant;
    private String usr;
    private Integer code;

}
