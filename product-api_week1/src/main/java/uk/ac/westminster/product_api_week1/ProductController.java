package uk.ac.westminster.product_api_week1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
        public Product getById(@PathVariable Long id){
        return new Product(id, "Laptop", 222.99);
    }

}
