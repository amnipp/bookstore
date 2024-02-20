package net.sirdagron.bookstore.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcType;
import org.hibernate.type.descriptor.jdbc.UUIDJdbcType;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcType(UUIDJdbcType.class)
    private UUID id;
    @Column(name="publisher_name")
    private String publisherName;
    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    //todo: more info on publisher
}
