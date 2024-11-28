package com.app.first_Springboot_rest_Producer.web.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    //1. FetchData
    @GetMapping("/fetch")
    public ResponseEntity<String> getProduct()
    {
        ResponseEntity<String> responseEntity=new ResponseEntity<>("BODY", HttpStatus.OK);
        return responseEntity;
    }
    //2.Create resource
    @PostMapping("/save")
    public ResponseEntity<String> createProduct()
    {
        ResponseEntity<String>response=new ResponseEntity<>("From Post Operations",HttpStatus.OK);
        return response;
    }
    //3.Modify Resource
    @PutMapping("/update")
    public ResponseEntity<String > updateProduct()
    {
        ResponseEntity<String>response=new ResponseEntity<>("From put operations",HttpStatus.OK);
        return response;
    }
    //4.Remove Resource
    @DeleteMapping("/delete")
    public ResponseEntity<String > deleteProduct()
    {
        ResponseEntity<String>response=new ResponseEntity<>("From delete operations",HttpStatus.OK);
        return response;
    }
    //5.Partial Update Resource
    @PatchMapping ("/updatecost")
    public ResponseEntity<String > modifyProductCost()
    {
        ResponseEntity<String>response=new ResponseEntity<>("From patch operations",HttpStatus.OK);
        return response;
    }

}
