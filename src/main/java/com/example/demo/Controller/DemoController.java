

@RestController
public class DemoController {

    @GetRequest
    public String getDemoUrl ()
    {
        return "Test String";
    }
}