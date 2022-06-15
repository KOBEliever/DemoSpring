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
    public void work(String arg1, String arg2, String arg3) throws Exception {
        System.out.println("使用" + this.box.getColor() + "以及" + this.paper.getSize() + "进行打印。");
        throw new Exception("主动抛出的异常");
    }

    public void workAround(String arg1, String arg2, String arg3) {
        System.out.println("原参数列表" + arg1 + "," + arg2 + "," + arg3);
        System.out.println("使用" + this.box.getColor() + "以及" + this.paper.getSize() + "进行打印。");
    }
}
