package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class PointDAOImpl implements PointDAO {

  @Inject
  private SqlSession session;

  private static String namespace = "org.zerock.mapper.PointMapper";

  @Override
  public void updatePoint(String uid1, int point1) throws Exception {

    Map<String, Object> paramMap = new HashMap<String, Object>();
    paramMap.put("uid1", uid1);
    paramMap.put("point1", point1);

    session.update(namespace + ".updatePoint", paramMap);

  }

}
