package org.example.hibernate.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
@Entity
@Data
@NoArgsConstructor
@Table(schema = "netology")
public class Persons {
    @EmbeddedId
    private PersonId id;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "city_of_living", nullable = false)
    private String city;
}
