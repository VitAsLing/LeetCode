package com.mercury.LRUCache;

public class LRUCacheTest {

    public static void main(String[] args) {
        testLRUCacheOperations();
    }

    private static void testLRUCacheOperations() {
        // 创建一个容量为 2 的 LRUCache
        LRUCache lruCache = new LRUCache(2);

        // 添加一些元素
        lruCache.put(1, 100);
        lruCache.put(2, 200);

        // 测试1: 获取已存在的元素
        assert lruCache.get(1) == 100 : "Test Case 1 Failed"; // 预期输出: 100

        // 测试2: 添加一个新元素
        lruCache.put(3, 300);
        assert lruCache.toString().equals("LRUCache State: {1=100, 3=300}") : "Test Case 2 Failed";

        // 测试3: 再次获取已存在的元素
        assert lruCache.get(2) == 200 : "Test Case 3 Failed"; // 预期输出: 200

        // 测试4: 添加新元素，由于容量限制，最旧的元素 (key=1, value=100) 将被淘汰
        lruCache.put(4, 400);
        assert lruCache.toString().equals("LRUCache State: {2=200, 3=300}") : "Test Case 4 Failed";

        // 测试5: 再次获取已淘汰的元素
        assert lruCache.get(1) == -1 : "Test Case 5 Failed"; // 预期输出: -1

        System.out.println("All test cases passed successfully!");
    }
}
