void DFS(Node root){
	if(root != null){
		root.visited = true;
		for(int i = 0; i < root.adjacent.size(); i++){
			if(root.adjacent[i].visited == false){
				DFS(root.adjacent[i]);
			}
		}
	}
}