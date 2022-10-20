class Solution {
public:
    int maximumUnits (vector<vector<int>>& boxTypes, int truckSize) { 
        sort (boxTypes.begin(), boxTypes.end(), [](auto& boxA, auto& boxB) { 
            return boxA[1] > boxB[1];
        });
        
        int totalUnits = 0;
        for (auto& box : boxTypes) { 
            int numBoxes = min(truckSize, box[0]);
            totalUnits += numBoxes * box[1];
            truckSize -= numBoxes;
        }
         return totalUnits;
    }
};
