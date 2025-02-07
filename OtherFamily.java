package treelinecalculationsalgorithm;

import java.util.ArrayList;

// Family Class
public class Family
{
    ArrayList<Member> familyMembers; // List of Members in the Family
    Member root;                     // First Member added to the Family

    // Default Constructor
    public Family()
    {
        familyMembers = new ArrayList<>();
        root = null;
    }

    // Adds a Member to the Tree
    public void addMember(Member newMember)
    {
        familyMembers.add(newMember);

        if(familyMembers.size() == 1)
        {
            root = newMember;
        }
    }

    // Removes a Member from the Tree
    public void removeMember(Member targetMember)
    {
        if(familyMembers.contains(targetMember))
        {
            familyMembers.remove(targetMember);
        }
    }
              
    // Clears all Members in the Tree
    public void clearMembers()
    {
        familyMembers.clear();
    }

    // Returns the desired Member from the Tree
    public Member accessMember(Member targetMember)
    {
        if(familyMembers.contains(targetMember))
        {
            for(int count = 0; count < familyMembers.size(); count++)
            {
                if(familyMembers.get(count) == targetMember)
                {
                    return familyMembers.get(count);
                }
            }
        }

        return null;
    }
}
