package spark.share.springfactories.impl;

import spark.share.springfactories.SpringFactoriesService;

/**
 * @author weiJohn
 * @version V1.00
 * @className SpringFactoriesServiceImpl
 * @date 01:55 2020-09-20
 */
public class SpringFactoriesServiceImpl implements SpringFactoriesService {
    @Override
    public void hello(String str) {
        System.out.println("hello " + str);
    }
}
