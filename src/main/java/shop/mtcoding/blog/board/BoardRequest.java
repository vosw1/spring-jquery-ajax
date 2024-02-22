package shop.mtcoding.blog.board;

import lombok.Data;

public class BoardRequest {

    @Data
    public static class WriteDTO{ // json으로 받을 DTO
        private String title;
        private String content;
        private String author;
    }
}
