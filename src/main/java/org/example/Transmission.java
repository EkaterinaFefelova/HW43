package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Transmission implements Workable{
    public void work(){
        System.out.println("The transmission is working");
    }

}
