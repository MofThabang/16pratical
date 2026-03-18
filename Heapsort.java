Public Static Void buildHeapBottomUp(String[]arr){
  heap =arr.clone();
  size = heap.length

    // start from last non-leaf node
    for(i=size/2-1;i>=0;i--;){
    HeapfyDown(i);
  }
}
