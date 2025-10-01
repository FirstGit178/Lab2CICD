package atu.ie.cicdlab2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController

public class ProductController {
    List<Product> myList = new ArrayList<>();


    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product myProduct)
    {
        myList.add(myProduct);
        return myProduct;
    }
    @PostMapping("/addAllProduct")
    public List<Product> addAllProduct(@RequestBody List<Product> myProduct)
    {
        myList.addAll(myProduct);
        return myList;
    }

    @GetMapping("/getProduct")
    public List <Product> getProduct()
    {
        return myList;
    }

}
