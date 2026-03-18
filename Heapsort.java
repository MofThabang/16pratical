Public Static Void buildHeapBottomUp(String[]arr){
  heap =arr.clone();
  size = heap.length

    // start from last non-leaf node
    for(i=size/2-1;i>=0;i--;){
    HeapfyDown(i);
  }
}

Public Static Void HeapfyDown(int i){
  int smallest=i;

    int left = 2*i+1;
    int right = 2*i+2;

  // compare left child
  if (left<size && heap[left].compareTo(heap[smallest])<0){
    smallest = i ;
  }
  

  // compare right child 
  if (right<size && heap[right].compareTo(heap[smallest]<0){
    smallest = i;
  }

// if child is smaller swipe
  if (smallest !=i){
    swap(i,smallest)
      heapfyDown(smallest);
  }
}


Public Static Void buildHeapTopDown(String[]  arr){
  heap = new String[arr.length]
    size =0

    for (String word;arr){
    insert(word);
  }
}

Public Static Void insert(String word){
  heap[size] = word
    int i =size
    size++;

  while (i> 0 && heap[i].compareTo(heap[i-1]/2]<0){
    swap(i, (i-1)/2;
    i= (i-2)/2;
  }
}

Public Static String[] Heapsort(){
  String[] sorted = new String [size]
    int originalsize = size;

  for (int i=0 ;i< sort.length;i++){
    sorted[i] = heap[0]
      heap[0]= heap[size-1];
    size--;
    heapfyDown(0);
  }
  size =originalsize
    return sorted
    }
  
