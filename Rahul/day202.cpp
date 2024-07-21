class Solution {
public:
    void dfs(int u, vector<int>& visited, unordered_map<int, vector<int>>& adj, stack<int>& st, bool &cycle) {
        visited[u] = 1;
        for (int &v : adj[u]) {
            if (visited[v] == 0) {
                dfs(v, visited, adj, st, cycle);
            } else if (visited[v] == 1) {
                cycle = true;
                return;
            }
        }
        visited[u] = 2;
        st.push(u);
    }

    vector<int> toposort(vector<vector<int>>& e, int n) {
        unordered_map<int, vector<int>> adj;
        for (vector<int>& i : e) {
            int u = i[0];
            int v = i[1];
            adj[u].push_back(v);
        }
        vector<int> visited(n + 1, 0);
        stack<int> st;
        vector<int> order;
        bool cycle = false;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                dfs(i, visited, adj, st, cycle);
                if (cycle == true) {
                    return {};
                }
            }
        }
        while (!st.empty()) {
            order.push_back(st.top());
            st.pop();
        }
        return order;
    }

    vector<vector<int>> buildMatrix(int k, vector<vector<int>>& rowConditions, vector<vector<int>>& colConditions) {
        vector<int> topoRow = toposort(rowConditions, k);
        vector<int> topoCol = toposort(colConditions, k);

        if (topoRow.empty() || topoCol.empty()) {
            return {};
        }

        vector<vector<int>> matrix(k, vector<int>(k, 0));
        vector<int> rowPos(k + 1, 0);
        vector<int> colPos(k + 1, 0);

        for (int i = 0; i < k; i++) {
            rowPos[topoRow[i]] = i;
            colPos[topoCol[i]] = i;
        }

        for (int i = 1; i <= k; i++) {
            matrix[rowPos[i]][colPos[i]] = i;
        }

        return matrix;
    }
};
