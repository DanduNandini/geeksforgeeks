
class Solution:    
    
    def minimumPlatform(self,arr,dep):

        arr.sort()
        dep.sort()
        platform_count=1
        max_platforms=1
        i=1
        j=0
        n=len(arr)
        while i<n and j<n:
            if arr[i]<=dep[j]:
                platform_count +=1
                i+=1
            elif arr[i]>dep[j]:
                platform_count -=1
                j+=1
            max_platforms=max(max_platforms,platform_count)
        return max_platforms
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys

#Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        arrival = list(map(int, input().strip().split()))
        departure = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.minimumPlatform(arrival, departure))
        print("~")

# } Driver Code Ends