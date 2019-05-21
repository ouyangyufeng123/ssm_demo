package com.ssm.control;

import com.ssm.control.base.BaseResponse;
import com.ssm.control.response.StudentResponse;
import com.ssm.control.vo.StudentVo;
import com.ssm.model.Student;
import com.ssm.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生信息查询接口
 * @author ouyangyufeng
 * @date 2019/1/24
 */
@Api(description = "学生信息查询接口")
@RequestMapping("/student/")
@RestController
public class StudentControl {

    @Autowired
    private StudentService stuService;

    /**
     * <p>查询所有学生信息</p>
     *
     * @param sid   用户id
     * @param sname 用户姓名
     * @param sage  用户年龄
     * @return
     */
    @ApiOperation(value = "单条件查询学生信息", notes = "传入相应单参数则条件查询数据，不传任何参数则查询所有数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sid", value = "学生id", required = false, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "sname", value = "学生姓名", required = false, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "sage", value = "学生年龄", required = false, dataType = "int", paramType = "query")})
    @GetMapping("findByStudent")
    public StudentResponse findByStudent(Long sid, String sname, Integer sage) {
        StudentResponse stuResp = BaseFind(stuService.selectByStudent(sid, sname, sage));
        return stuResp;
    }

    @ApiOperation(value = "查询学生所有信息")
    @GetMapping("findAllStudent")
    public StudentResponse findAllStudent(){
        StudentResponse stuResp = BaseFind(stuService.selectAllStudent());
        return stuResp;
    }


    public StudentResponse BaseFind(List<Student> listStu){
        StudentResponse stuResp = new StudentResponse();
        StudentVo stuVo = null;
        List<StudentVo> listStuVo = new ArrayList<>();
        for (Student stu : listStu) {
            stuVo = new StudentVo();
            BeanUtils.copyProperties(stu, stuVo);
            listStuVo.add(stuVo);
        }
        stuResp.setStudentVo(listStuVo);
        return stuResp;
    }

    /**
     * <p>添加学生信息</p>
     *
     * @param stu
     * @return
     */
    @ApiOperation(value = "添加学生信息")
    @PostMapping("insertStudent")
    public BaseResponse insertStudent(@RequestBody Student stu) {
        stuService.insertStudent(stu);
        return new BaseResponse();
    }

    /**
     * <p>删除学生信息</p>
     *
     * @param sid
     * @return
     */
    @ApiOperation(value = "删除学生信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "sid", value = "学生id", required = true, dataType = "Long", paramType = "query")})
    @DeleteMapping("deleteStudent")
    public BaseResponse deleteStudent(Long sid) {
        stuService.deleteStudent(sid);
        return new BaseResponse();
    }

    /**
     * <p>修改学生信息</p>
     *
     * @param stu
     * @return
     */
    @ApiOperation(value = "修改学生信息")
    @PutMapping("updateStudent")
    public BaseResponse updateStudent(@RequestBody Student stu) {
        stuService.updateStudent(stu);
        return new BaseResponse();
    }
}
