package com.example.ttu;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Tidtagarur")
@Table(name = "Tid")
public class ttu {
    @Id
    @Column(name = "Id")
    String id;
    @Column(name = "Millisek")
    String milliseconds;
    @Column(name = "Sekunder")
    String seconds;
    @Column(name = "Minuter")
    String minutes;
    @Column(name = "Timmar")
    String hours;
}