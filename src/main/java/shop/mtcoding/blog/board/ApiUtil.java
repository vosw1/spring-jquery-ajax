package shop.mtcoding.blog.board;

import lombok.Data;

@Data
public class ApiUtil<T> {
    private Integer status; // 상태 코드 : 200, 400, 404, 405
    private String msg; // 메세지 : 성공, 실패시 -> 정확한 메세지
    private T body; // 데이터 타입을 알 수 없으니 제네릭 사용

    public ApiUtil(T body) {
        this.status = 200;
        this.msg = "성공";
        this.body = body;
    }

    public ApiUtil(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
        this.body = body;
    }
}