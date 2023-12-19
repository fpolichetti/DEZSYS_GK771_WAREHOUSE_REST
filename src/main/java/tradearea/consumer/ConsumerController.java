package tradearea.consumer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsumerController {

    @GetMapping("/warehouse/{id}/consumer")
    public String warehouseConsumerPage() {
        return "consumer";
    }
}
