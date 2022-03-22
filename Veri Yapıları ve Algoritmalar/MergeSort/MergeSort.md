[16,21,11,8,12,22] -> Merge Sort

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
Big-O gösterimini yazınız.

Cevap

	[16,21,11,8,12,22]
        /             \
   [16,21,11]       [8,12,22]
     /     \          /     \  
 [16,21]   [11]    [8,12]  [22]
  /   \      |      /  \     |
[16] [21]   [11]  [8] [12]  [22] 
   \  /      |      \  /     |
 [16,21]    [11]    [8,12]  [22]
      \      /         \     /
     [11,16,21]       [8,12,22]
     
     
 Big O Notation:  O(nlogn)   
