package com.cqu.spring.print;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Printer {
    @Autowired
    @Qualifier("colorBox")
    private Box box;//墨盒
    @Autowired
    @Qualifier("b5Paper")
    private Paper paper;//纸张

    /**
     * 打印
     */
    public void work(String arg1, String arg2, String arg3) {
        System.out.println("使用" + this.box.getColor() + "以及" + this.paper.getSize() + "进行打印。");
    }
}
