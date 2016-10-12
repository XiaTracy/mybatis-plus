/**
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.test.activerecord;

import com.baomidou.mybatisplus.MybatisSessionFactoryBuilder;
import com.baomidou.mybatisplus.activerecord.Record;
import com.baomidou.mybatisplus.test.mysql.TestMapper;
import com.baomidou.mybatisplus.test.mysql.entity.Test;
import com.baomidou.mybatisplus.toolkit.TableInfoHelper;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * ActiveRecord 测试
 * </p>
 * 
 * @author Caratacus
 * @date 2016-10-11
 */
public class ActiveRecordTest {

	public static void main(String[] args) {

        // 加载配置文件
        InputStream in = TestMapper.class.getClassLoader().getResourceAsStream("mysql-config.xml");
        MybatisSessionFactoryBuilder mf = new MybatisSessionFactoryBuilder();
        mf.build(in);
        List<Record> test = TableInfoHelper.getTable(Test.class).select().all();
        System.out.println(test);

		/*DB db = DB.open("jdbc:mysql://localhost/mybatis-plus", "root", "521");
		TableInfoHelper.initTableInfo(Test.class,db);
		List<Record> test1 = db.active("test").select().all();
		System.out.println(test1);

		*//* 未找到异常 *//*
		db.active("test1").select().all();*/

	}
}
