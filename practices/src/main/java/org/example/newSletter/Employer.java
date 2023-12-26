package org.example.newSletter;


import java.util.List;

@Entity
@Table()
public class Employer {

    @Id(genration)
            @column (Name)
    Long id;
    @Column(name = "")
    String name ;

    @OnetoMany
    List<Address>  address;
}
