// RegistrationController.java
@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationRepository registrationRepository;

    @GetMapping
    public List<RegistrationEntity> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    @PostMapping
    public RegistrationEntity saveRegistration(@RequestBody RegistrationEntity registration) {
        return registrationRepository.save(registration);
    }
}
