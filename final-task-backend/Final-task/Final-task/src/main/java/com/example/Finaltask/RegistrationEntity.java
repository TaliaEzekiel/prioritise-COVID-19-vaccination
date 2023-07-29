// RegistrationEntity.java
@Entity
@Table(name = "registrations")
public class RegistrationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String address;
    private String city;
    private String zipCode;
    private String landline;
    private String cellphone;
    private boolean hasCovidHistory;

    // Getters and Setters
}
