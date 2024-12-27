package web.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Delivery {
    private Long id;

    private Long merchId;

    private String address;
}
