package com.monpro.cloudmusic.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
  private Integer status = 200;

  private Object data;

  public Response(Object data) {
    this.data = data;
  }

  public static Response success(Object data) {
    return new Response(data);
  }

  public static Response success(Integer status, Object data) {
    return new Response(status, data);
  }
}
