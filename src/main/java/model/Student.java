package model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "enrollment_date")
    private LocalDate enrollmentDate;

    @Column(name = "program_of_study")
    private String programOfStudy;

    @Column(name = "status")
    private String status;

    @Lob
    @Column(name = "student_photo")
    private byte[] studentPhoto;
}
