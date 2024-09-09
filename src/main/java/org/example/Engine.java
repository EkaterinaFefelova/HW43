package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Engine implements Workable{
    public void work(){
        System.out.println("The engine is working");
    }

}
