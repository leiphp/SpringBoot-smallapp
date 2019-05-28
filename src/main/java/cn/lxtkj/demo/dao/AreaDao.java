package cn.lxtkj.demo.dao;

import cn.lxtkj.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int inserArea(Area area);
    int updateArea(Area area);
    int deleterArea(Area area);
}
