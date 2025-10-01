package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table (name = "speaker")
public class Speaker{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}