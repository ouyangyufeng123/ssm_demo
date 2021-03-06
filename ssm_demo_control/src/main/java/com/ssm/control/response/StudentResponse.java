package com.ssm.control.response;

import com.ssm.control.base.BaseResponse;
import com.ssm.control.vo.StudentVo;
import lombok.Data;

import java.util.List;

/**
 * Created by ouyangyufeng on 2019/1/24.
 */
@Data
public class StudentResponse extends BaseResponse{

    private List<StudentVo> studentVo;
}
