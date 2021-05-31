##数据结构
#####数组、链表、栈、队列、堆、树、散列表
####数组
~~~

~~~
####队列
~~~
1. 队列是一种特殊的线性表，他的特殊性在于我们只能操作他头部和尾部的元素，中间的元素我们操
   作不了，我们只能在他的头部进行删除，尾部进行添加
2. 队列实现方式一般有两种，一种是基于数组的，还一种是基于链表的，
3. 双端队列
Deque是一个双端队列接口，继承自Queue接口，Deque的实现类是LinkedList、
ArrayDeque、LinkedBlockingDeque，其中LinkedList是最常用的。
~~~
####栈
~~~
1. 栈也是一种特殊的线性表，他只能对栈顶进行添加和删除元素
2. 栈的实现可以使用数组也可以使用链表
~~~
####堆
~~~
1. 堆是一颗完全二叉树，在这棵树中，所有父节点都满足大于等于其子节点的堆叫大根堆，
所有父节点都满足小于等于其子节点的堆叫小根堆
2. 
~~~
##Java集合总结
####1.list
~~~

(1)ArrayList 类是可动态修改的数组，与普通数组的区别就是没有固定大小的限制，可以添加或删除元素。
    ArrayList 继承了 AbstractList ，并实现了 List 接口。
(2)链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的
顺序存储数据，而是在每一个节点里存到下一个节点的地址。
    LinkedList 继承了 AbstractSequentialList 类。
    LinkedList 实现了 Queue 接口，可作为队列使用。
    LinkedList 实现了 List 接口，可进行列表的相关操作。
    LinkedList 实现了 Deque 接口，可作为队列使用。
    LinkedList 实现了 Cloneable 接口，可实现克隆。
    LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。
(3)使用场景
以下情况使用 ArrayList :
频繁访问列表中的某一个元素。
只需要在列表末尾进行添加和删除元素操作

以下情况使用 LinkedList :
你需要通过循环迭代来访问列表中的某些元素。
需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
~~~
####2.queue
~~~
1. priorityQueue，即优先队列，作用是保证每次取出的元素都是队列中权值最小的，
2. PriorityQueue实现了Queue接口，不允许放入null元素；其通过堆实现，
具体说是通过完全二叉树（complete binary tree）实现的小顶堆
3. leftNo = parentNo*2+1
   rightNo = parentNo*2+2
   parentNo = (nodeNo-1)/2
~~~

####3. set总结
~~~
hashset
1.基本信息
HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
HashSet 允许有 null 值。
HashSet 是无序的，即不会记录插入的顺序。
HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 
        您必须在多线程访问时显式同步对 HashSet 的并发访问。
HashSet 实现了 Set 接口。

~~~

####4. hashmap总结
~~~
hashmap
1.基本信息
HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
HashMap 是无序的，即不会记录插入的顺序。
HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。

~~~
##Java面试总结
###关键字
~~~
1.transient
  将不需要序列化的属性前添加关键字transient，序列化对象的时候，这个属性就不会被序列化
  底层原理：transient的作用就是把这个字段的生命周期仅存于调用者的内存中而不会写到磁盘里持久化，
  意思是transient修饰的age字段，他的生命周期仅仅在内存中，不会被写到磁盘中。
  

~~~
##面试总结
~~~
1. 腾讯实习
- 求第K大，O(n)复杂度
- 二叉树Z形遍历
- 数据流中位数
- 完全背包
2.阿里
（1）求第K大
给n个长度的序列，找到最大值的k
要求：数组中的连续K个数，最小值大于等于k
输入：n=5,l=[1,3,4,5,2]
输出：3 （3，4，5）这k=3个最小值大于等于k=3
(2)dfs
给定n个点，两两之间都有边，也就是有n*(n-1)/2条边
再给定m个数对，表示拆除m条边
问还剩多少个连通图，每个连通图有多少个结点
输入：n,m=[5,5]
l=[[1,2],[3,4],[3,2],[4,2],[2,5]]
输出：
2
1 4



~~~