package com.zjh.nettytest.main;

import java.util.concurrent.*;

/**
 * Description: netty-test
 * DateTime: 2020/8/7 5:16 下午
 *
 * @author 张江浩
 */
public class Main2 {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> c = ()->{
            Thread.sleep(3000);
            return 100;
        };
        //构建定长线程池
        ExecutorService service = new ThreadPoolExecutor(1,10,1,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(16));
        //在线程池中提交Callable时会返回Future对象
        Future<Integer> future = service.submit(c);
        System.out.println(future.get());
    }

}
