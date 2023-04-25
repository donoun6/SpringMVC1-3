package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
//어노테이션은 위험하다. 핵심 도메인에서 사용하기는 위험하다. 필요한것을 분리하여 사용하자 (Getter , Setter). DTO에서사용 현재는 예제 프로젝트기 때문에 사용
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
