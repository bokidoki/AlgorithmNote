> 边界收缩行为 1： mid 被分到左边。即区间被分成 [left, mid] 与 [mid + 1, right]，此时取中间数的时候下取整。

```java
int mid = left + (right - left) / 2;
if (check(mid)) {
    // 下一轮搜索区间是 [mid + 1, right]
    left = mid + 1;
} else {
    right = mid;
}
```

> 边界收缩行为 2： mid 被分到右边。即区间被分成 [left, mid - 1] 与 [mid, right]，此时取中间数的时候上取整。
  
```java
int mid = left + (right - left + 1) / 2;
if (check(mid)) {
    // 下一轮搜索区间是 [left, mid - 1]
    right = mid - 1;
} else {
    left = mid;
}
```

参考
 
- [用「排除法」（减治思想）写二分查找问题、与其它二分查找模板的比较](https://leetcode-cn.com/problems/search-insert-position/solution/te-bie-hao-yong-de-er-fen-cha-fa-fa-mo-ban-python-/) - liweiwei1419
